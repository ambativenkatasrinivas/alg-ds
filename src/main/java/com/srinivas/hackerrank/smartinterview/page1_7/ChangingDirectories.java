package com.srinivas.hackerrank.smartinterview.page1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangingDirectories {
    public static class Stack {
        private int top = -1;
        private String arr[] = new String[1000];

        public void push(String x) {
            arr[++top] = x;
        }

        public String pop() {
            if (top == -1) {
                return "";
            }
            return arr[top--];
        }

        public String peek() {
            return arr[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    static Stack stack = null;

    public static void main1(String[] args) {
        System.out.println("..".equals(".."));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer = new StringBuffer();
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t > 0) {
            int n = Integer.parseInt(bufferedReader.readLine());
            stack = new Stack();
            stack.push("/");
            while (n > 0) {
                String cmd = bufferedReader.readLine();
                String res = changingDirectories(cmd);
                if (!res.equals("-1")) {
                    stringBuffer.append(res).append("\n");
                }
                n--;
            }
            stringBuffer.append("\n");
            t--;
        }
        System.out.println(stringBuffer);
    }

    private static String changingDirectories(String cmd) {
        if (cmd.equals("pwd")) {
            String pwd = "";
            Stack temp = new Stack();
            while (!stack.isEmpty()) {
                temp.push(stack.pop());
            }
            while (!temp.isEmpty()) {
                String folder = temp.pop();
                stack.push(folder);
                if (!folder.equals("/"))
                pwd = pwd + "/" + folder;
            }
            return pwd+"/";
        } else {
            String[] elements = cmd.split(" ");
            if (elements[0].equals("cd")) {
                if (elements[1].charAt(0) == '/'){
                    stack = new Stack();
                    stack.push("/");
                }
                String folders[] = elements[1].split("/");
                for (int i = 0; i < folders.length; i++) {
                       if (folders[i].contains(".")) {
                           stack.pop();
                       } else if (!folders[i].equals("")) {
                           stack.push(folders[i]);
                       }
                }
            }
            return "-1";
        }
    }
}
