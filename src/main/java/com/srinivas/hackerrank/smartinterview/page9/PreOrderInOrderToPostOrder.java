package com.srinivas.hackerrank.smartinterview.page9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PreOrderInOrderToPostOrder {
    public static void main(String[] args) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t > 0) {
            int n = Integer.parseInt(bufferedReader.readLine());
            String ele[] = bufferedReader.readLine().split(" ");
            int preorder[] = new int[ele.length];
            int inorder[] = new int[ele.length];
            for (int i = 0; i < ele.length; i++) {
                preorder[i] = Integer.parseInt(ele[i]);
            }
            ele = bufferedReader.readLine().split(" ");
            for (int i = 0; i < ele.length; i++) {
                inorder[i] = Integer.parseInt(ele[i]);
            }
            printPostOrder(preorder,inorder,0,preorder.length-1);
            System.out.println();
            k=0;
            t--;
        }

    }

    static int k = 0;

    private static void printPostOrder(int preorder[], int inorder[], int start, int end) {

        if (start > end) {
            return;
        }

        int idx = search(inorder, preorder[k++], start, end);
        printPostOrder(preorder, inorder, start, idx - 1);
        printPostOrder(preorder, inorder, idx + 1, end);
        System.out.print(inorder[idx] + " ");
    }

    private static int search(int[] inorder, int k, int low, int high) {
        for (int i = low; i <= high; i++) {
            if (inorder[i] == k) {
                return i;
            }
        }
        return -1;
    }
}
