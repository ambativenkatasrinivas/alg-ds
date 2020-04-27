package com.srinivas.hackerrank.smartinterview.page1_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String args[]) {

        //"\\\"PASSWORD\" value=\"(.*)\\\"><i"
    /*    String text = "This is the text to be searched";

        // Specifies the string pattern which is to be searched
        String delimiter =  ".*is.*";
        Pattern pattern = Pattern.compile(delimiter);

        // Used to perform case insensitive search of the string
        Matcher result = pattern.matcher(text);

        System.out.println(result.group(0));*/

        String line = "This order was placed for QT3000! OK?";

        String line2    = "This is the text to be searched " +
                        "for occurrences of the http:// pattern. text";

        String line4    = "This is the text123 to be searched " +
                "for occurrences of the http:// pattern. text123";

        //String line5 = "<html><head><title>HTTP Auto Post Form</title></head><body onload=\"javascript:document.forms[0].submit()\"><noscript><p><strong>Note:</strong> Since your browser does not support JavaScript,you must press the Resume button once to proceed.</p></noscript><form method=\"post\" action=\"https://stg-healthid.optum.com/siteminderagent/forms/login.fcc\"><input type=\"hidden\" name=\"TARGET\" value=\"-SM-%2Ftb%2Fapp%2Fsecure%2Fhome.do%3FrelyingAppAlias%3Dbep\"><input type=\"hidden\" name=\"SMAGENTNAME\" value=\"-SM-UfHbIc7ahF9QIAbwevHva3e9mhGXDvymGbube2xlU/VqnaGB+Mca44r9+3+zM3Bv\"><input type=\"hidden\" name=\"SMAUTHREASON\" value=\"27\"><input type=\"hidden\" name=\"PASSWORD\" value=\"jRsUuHR7hq3HgY6q71jj2FG5BYcMiAShl0i9O8IeT7QfKw4VWb0LaQlAaVGAEzxSjKyr4qL8DE%2BiKdnsfx9%2B1SsrW3Bv6Y7uwRBCe5HCdbKHLdwda7TJqh7hi7hafwsxGSRjF%2FAcO58U8EocRDKoLxB0K6rYXGuh0qeaZJXPPJg6ZDupGVFbAo%2BO%2BnCVKPX2pwP4lPbvzo67fIWvyBi0qFiUq4WHiLs3goTl3euWCv9RNKxb9dP95J6jmX3qAuZkbxHSCtpYqP8Rfa%2Fp2QvWQK1PvsIy6rBc3COQ5l6aszoP1GwPqtaP23WAGiB25IeNDCWyj2m9XblRrGn7nL2FAauP1gqDx9ILmMuSQ9qul3Pei9vGFGdNF9RCQJRPP1C1\"><input type=\"hidden\" name=\"USER\" value=\"user_emp_mul\"><noscript><input type=\"submit\" value=\"Resume\"/></noscript></form></body></html>";

        String line5 = "<html><head><title>HTTP Auto Post Form</title></head><body onload=\"javascript:document.forms[0].submit()\"><noscript><p><strong>Note:</strong> Since your browser does not support JavaScript,you must press the Resume button once to proceed.</p></noscript><form method=\"post\" action=\"https://stg-healthid.optum.com/siteminderagent/forms/login.fcc\"><input type=\"hidden\" name=\"PASSWORD\" value=\"xdlKSur%2Fzk6iOOeAtyRSxnJsQlCKE7OSWHOOCILYAM%2FmhI001FH9UHDkR9IkBIcwIi%2BnNsbAAQU1XDovf9zq0NCZg7A6OtJ4ps1iEwbOxnv3UpKVrJBCsJy0MvGIZMX027Mq9J6Zv65mVIjIDqXXgGixmf%2BOEZ54pJO7IgL6EUJcOc32gjlKkUOE%2BDDdeuWBPotU4B3zsuMHRd3S0smTVbpEOAY%2FbZ5kDOjN4qXxcBdg8p5cmqRljqDp1i5tQ%2BLUCMonlUH2tqlM%2BLHSVcfsYeng0e7pGyc0KVD%2BVJHA9%2BO4%2FPnhOSAiTCp8%2FgIA%2FNvcT6pPgFIT%2FyRxdvhTPuH3ULqie%2Bo06KlmKrzX2g0RMJPSRKF7sSBCtfa3b1Ir4wWo\"><input type=\"hidden\" name=\"TARGET\" value=\"-SM-%2Ftb%2Fapp%2Fsecure%2Fhome.do%3FrelyingAppAlias%3Dbep\"><input type=\"hidden\" name=\"SMAUTHREASON\" value=\"27\"><input type=\"hidden\" name=\"USER\" value=\"stg_internal_2\"><input type=\"hidden\" name=\"SMAGENTNAME\" value=\"-SM-UfHbIc7ahF9QIAbwevHva3e9mhGXDvymGbube2xlU/VqnaGB+Mca44r9+3+zM3Bv\"><noscript><input type=\"submit\" value=\"Resume\"/></noscript></form></body></html>";

        String line8 = "<?xml version=\"1.0\" encoding=\"iso-8859-1\"?> \n" +
                "\n" +
                "\n" +
                "\n" +
                " \n" +
                "\n" +
                "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n" +
                "<html dir=\"ltr\" xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\" xmlns:v=\"urn:schemas-microsoft-com:vml\" >\n" +
                "\t<head>\n" +
                "\t   \n" +
                "\t\t<!--  meta http-equiv=\"content-type; X-UA-Compatible\" content=\"text/html; charset=iso-8859-1; IE=EmulateIE8\" /> UTF-8 ?? -->\n" +
                "\t\t<title>\n" +
                "\t\t\tUnrecognized Device\n" +
                "\t\t</title>\n" +
                "\t\t\n" +
                "\t\t<script type=\"text/javascript\" src=\"/aa-web/scripts/jquery-1.5.1.js\"></script>\n" +
                "\t\t<script type=\"text/javascript\"\tsrc=\"/aa-web/scripts/click.js\"></script>\n" +
                "\t\t\n" +
                "\t\t<script type=\"text/javascript\">\n" +
                "\t\tvar myNav = navigator.userAgent.toLowerCase();\n" +
                "\t\tif (myNav.indexOf('msie') != -1) {\n" +
                "\t\t\tvar meta = document.createElement('meta');\n" +
                "\t\t\tmeta.setAttribute('http-equiv', 'X-UA-Compatible');\n" +
                "\t\t\tmeta.setAttribute('content', 'IE=EmulateIE8');\n" +
                "\t\t\tdocument.getElementsByTagName('head')[0].appendChild(meta);\n" +
                "\n" +
                "\t\t}\n" +
                "\t\t\t </script>\n" +
                "\t\t\n" +
                "\t\t\n" +
                "\t\t<!--  meta http-equiv=\"Pragma\" content=\"no-cache\"/>\n" +
                "  \t\t<meta http-equiv=\"Expires\" content=\"-1\"/>-->\n" +
                "  \t\t\n" +
                "  \t\t<!-- <meta http-equiv=\"Cache-Control\" content=\"no-store, no-cache, must-revalidate, Post-Check=0, Pre-Check=0\"/> -->\n" +
                "  \t\t<!-- meta http-equiv=\"Content-Language\" content=\"\" />  -->\n" +
                "  \t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n" +
                "\t</head>\n" +
                "\t<body id=\"standard\">\n" +
                "            <div id=\"page\">\n" +
                "            <div class=\"tk-wrapper tk-wrapper-overwrite\">\n" +
                "                  <div id=\"header\" class=\"\">\n" +
                "                        \n" +
                "\n" +
                "\n" +
                "<head>\n" +
                "<link rel=\"stylesheet\" href=\"styles/tbng.css\" type=\"text/css\" />\n" +
                "<script type=\"text/javascript\"\tsrc=\"scripts/tbngNavigation.js\"></script>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<script type=\"text/javascript\" src=\"//assets.adobedtm.com/bff7f95d5e60a9bb1bafa9115ce25108c698418f/satelliteLib-44095d38c55c9ce0b360d0738711ab90cc5889a4-staging.js\"></script>\t\n" +
                "<script>\n" +
                "\t\t//page data layer\n" +
                "\t\t/* var pageDataLayer={ \"pageName\":document.title.toLowerCase(), \n" +
                "\t\t\t\t\t\t\t\"businessUnit\":\"optum\", \n" +
                "\t\t\t\t\t\t\t\"website\":\"id\",\n" +
                "\t\t\t\t\t\t\t\"errorFields\":\"\",\"siteErrorType\":\"\"}; */\n" +
                "\t\t  var pageDataLayer={\n" +
                "\t\t\t\t\t\t\tcontent:{\n" +
                "\t\t\t\t\t\t\t\t\"pageName\":document.title.toLowerCase(), \n" +
                "\t\t\t\t\t\t\t\t\"businessUnit\":\"optum\", \n" +
                "\t\t\t\t\t\t\t\t\"website\":\"id\",\n" +
                "\t\t\t\t\t\t\t\t\"siteSectionL1\":\"\",\n" +
                "\t\t\t\t\t\t\t\t\"siteSectionL2\":\"\",\n" +
                "\t\t\t\t\t\t\t\t\"siteSectionL3\":\"\",\n" +
                "\t\t\t\t\t\t\t\t\"siteErrorCode\":\"\",\n" +
                "\t\t\t\t\t\t\t\t\"siteErrorType\":\"\",\n" +
                "\t\t\t\t\t\t\t\t\"siteErrorFields\":\"\",\n" +
                "\t\t\t\t\t\t\t\t\"recoveryType\":\"\"\n" +
                "\t\t\t\t\t\t\t\t}\n" +
                "\t\t\t\t\t\t\t};\t\t\t\t\t\t\t\n" +
                "\t\t  _satellite.track('trackPageView');\t\n" +
                "</script>\n" +
                " \n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "</head>\n" +
                "<!-- image service url from properties file -->\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<input type=\"hidden\" value='Broker and Employer Portal' id=\"relyingPartyAppNameHidden\"/>\t \n" +
                "\n" +
                "\n" +
                "<input type=\"hidden\" value='https://stg-healthid.optum.com/tb/services/rest/rp/rpapplogo' id=\"imageServiceUrlHidden\"/>\n" +
                "<input type=\"hidden\" value='https://stg-healthid.optum.com/tb/app/index.html' id=\"signInUrl\"/>\n" +
                "<input type=\"hidden\" value='Optum ID' id=\"headerImageAltTextHidden\"/>\n" +
                "<!-- Show panel only for trust broker nextgen -->\n" +
                "\n" +
                "<div id=\"topPannelNg\" hidden>\n" +
                "\t<div id=\"topPannel\">\n" +
                "\t\t<div id=\"helpLinkWrapper\"> \n" +
                "\t\t\t\n" +
                "\t\t</div>\n" +
                "\t</div>\n" +
                "</div>\n" +
                "\n" +
                "<div id=\"topBanner\"></div>\n" +
                "\n" +
                "                  </div> \n" +
                "                  <div id=\"topNavigation\">\n" +
                "                \t\n" +
                "<!-- <ul >              \n" +
                "\t<li ><a id=\"toptab1\" href=\"#\">Link1</a></li>\n" +
                "\t<li ><a id=\"toptab2\" href=\"#\">Link2</a></li>\n" +
                "\t<li ><a id=\"toptab3\" href=\"#\">Link3</a></li>\n" +
                "\t<li ><a id=\"toptab4\" href=\"#\">Link4</a></li>\n" +
                "\t<li ><a id=\"toptab5\" href=\"#\">Link5</a></li>\t\t\t\t\t\n" +
                "</ul> -->\n" +
                "                  </div>\n" +
                "                  <div id=\"pageContainer\" class=\"clearfix\">\n" +
                "                        <div class=\"topBorder\">  </div>\n" +
                "                        <div id=\"pageContent\">\n" +
                "                         \t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<input type=\"hidden\" value='https://stg-healthid.optum.com/tb/webHelp/Default_CSH.htm#Optum_ID_CSH/entry_1010_Security_Questions_Unrecognized_Device.htm' id=\"secQuesPageHelpUrl\"/> \n" +
                "<script>\t\n" +
                "\tvar vSecQuesPageHelpUrl = document.getElementById(\"secQuesPageHelpUrl\").value;\n" +
                "\t$(\"#helpLinkWrapper\").append('<a class=\"helpLink\" target=\"_blank\" id=\"helpLink\" href='+vSecQuesPageHelpUrl+' onclick =\"openHelpLinkInNewWindow(\\''+vSecQuesPageHelpUrl+'\\'); return false;\"> <span class=\"cux-icon-help\">&nbsp;</span><span class=\"ng-binding\">Help</span><span class=\"oui-a11y-hidden\">&nbsp;opens in a new window</span></a>');\n" +
                "</script>\n" +
                "\n" +
                "\n" +
                "<link rel=\"stylesheet\" type=\"text/css\" href=\"https://stg-healthid.optum.com/tb/services/rest/whitelabel/css/aaweb/\" />\n" +
                "\n" +
                "\n" +
                "\n" +
                "\t<script>\n" +
                "\t\tpageDataLayer.content.pageName = 'unrecognizeddevice'; \n" +
                "\t</script>\n" +
                "\n" +
                "\n" +
                "<div id=\"authQuestionWrapper\">\n" +
                "\n" +
                "\t<div class=\"authQuestionTitleWrapper\">\n" +
                "\t\t<div class=\"authQuestionTitle\">\n" +
                "\t\t\tUnrecognized Device\n" +
                "\t\t</div>\n" +
                "\t</div>\n" +
                "\t\n" +
                "\t<!-- Common Error Box -->\n" +
                "<div class=\"commonErrorBox\"></div>\n" +
                "\t\n" +
                "\t<div class=\"authQuestionHelpPage\">\n" +
                "\t\t<a class=\"helplinks\" href=\"help.htm\"\n" +
                "\t\t\ttitle=\"Opening in a new window\"><img width=\"13\" height=\"13\"\n" +
                "\t\t\tstyle=\"vertical-align: bottom;\" alt=\"Help Link\" longdesc=\"Help Link\"\n" +
                "\t\t\tsrc=\"/aa-web/images/arrow_help_link.gif\"> Need Help ?</a>\n" +
                "\t</div>\n" +
                "\n" +
                "\n" +
                "\t<div class=\"authQuestionHeading\">\n" +
                "\t\t<span id=\"authQuestionContent\">It looks like you are signing in from a new device. Please answer the security question to verify your identity. You can bypass this step in the future by checking the box. </span>\n" +
                "\t</div>\n" +
                "\n" +
                "\n" +
                "\t<div class=\"authQuestionForm\">\n" +
                "\n" +
                "\t\t<form id=\"userCommand\" action=\"/aa-web/evaluate?execution=e1s2&amp;action=securityQuestion\" method=\"post\" autocomplete=\"off\">\n" +
                "\n" +
                "\n" +
                "\t\t\t<div class=\"challengeQuestions\">\n" +
                "\t\t\t\t\n" +
                "\t\t\t\t\t<div>\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t<div class=\"challengeQuestionList\">\n" +
                "\t\t\t\t\t\t\t\t<div class=\"challengeSecurityQuestions\">\n" +
                "\t\t\t\t\t\t\t\t\t<div class=\"authQuestionLabel\">\n" +
                "\t\t\t\t\t\t\t\t\t\t<div class=\"authQuestiontext\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<label id=\"challengeQuestionLabelId\" for=\"challengeQuestionList[0].userAnswer\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\tWhat is your best friend&#039;s name? \n" +
                "\t\t\t\t\t\t\t\t\t\t\t</label>\n" +
                "\t\t\t\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"challengeSecurityAnswer\" id=\"challengeSecurityAnswerId\">\n" +
                "\t\t\t\t\t\t\t\t\t<input id=\"challengeQuestionList[0].userAnswer\" name=\"challengeQuestionList[0].userAnswer\" aria-invalid=\"false\" aria-required=\"true\" class=\"challengeSecurityUserAnswerInput\" aria-describedby=\"challengeSecurityAnswerCaseSensitiveLabel[0]\" onfocus=\"toggle_sec_answer_textbox_alert(&#39;challengeQuestionList[0].userAnswer&#39;)\" type=\"password\" value=\"\" size=\"50\"/>\n" +
                "\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t<span aria-live=\"assertive\" aria-atomic=\"true\" id=\"ariaLiveRegion\" class=\"hidden\"></span> \n" +
                "\t\t\t\t\t\t\t\t\t\t<button id = \"sec_answer_button\" class=\"passwd_button\" type=\"button\" role=\"button\" onclick=\"toggle_sec_answer('challengeQuestionList[0].userAnswer')\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t<span aria-hidden=\"true\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t<span id=\"answerIconId\" class=\"cux-icon-view\"></span>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t</span>\n" +
                "\t\t\t\t\t\t\t\t\t\t</button>\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t<!-- Errors -->\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t<div class=\"authQuesGlobalError\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\t\t\t\t\t\t<div tabindex=\"-1\"  class=\"challengeSecurityAnswerError\" id=\"challengeSecurityAnswerErrorId\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t<div \n" +
                "\t\t\t\t\t\t\t\t\t\tclass=\"authQuesWrongAnswerError\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t\t\t<!-- Errors end    -->\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\t<div tabindex=\"-1\"\n" +
                "\t\t\t\t\t\t\t\t\t\t\tid=\"challengeSecurityAnswerCaseSensitiveLabel[0]\"\n" +
                "\t\t\t\t\t\t\t\t\t\t\tclass=\"challengeSecurityAnswerCaseSensitiveLabel\">\n" +
                "\t\t\t\t\t\t\t\t\t\t\tAnswer is not case sensitive.\n" +
                "\t\t\t\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t\n" +
                "\t\t\t\t\n" +
                "\t\t\t</div>\n" +
                "\n" +
                "\t\t\t\n" +
                "\t\t\t\t<div class=\"authQuestionRadio\">\n" +
                "\t\t\t\t\t<div class=\"authQuestionCheckboxHeading\">\n" +
                "\t\t\t\t\t\t<div class=\"authQuestionPersonal\">\n" +
                "\t\t\t\t\t\t\t<input id=\"ac\" name=\"rememberMyDevice\" type=\"checkbox\" value=\"true\"/><input type=\"hidden\" name=\"_rememberMyDevice\" value=\"on\"/>\n" +
                "\t\t\t\t\t\t\t<label id=\"personalDeviceLabelId\" for=\"ac\">Skip this step when signing in because this device is personal or private.</label>\n" +
                "\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t</div>\n" +
                "\t\t\t\t</div>\n" +
                "\t\t\t\n" +
                "\n" +
                "\t\t\t<div class=\"authQuestionNavigation\">\n" +
                "\t\t\t\t<!-- submit button -->\n" +
                "\t\t\t\t<input type=\"hidden\" name=\"_eventId\" value=\"submit\" /> <input\n" +
                "\t\t\t\t\ttype=\"submit\" name=\"submit\" class=\"nextButton\"\n" +
                "\t\t\t\t\tvalue=Next\n" +
                "\t\t\t\t\tid=\"authQuesSubmitButton\" />\n" +
                "\n" +
                "\t\t\t\t<!-- cancel link -->\n" +
                "\t\t\t\t<a class=\"verifyAuthCancelLink\" href=\"#\"\n" +
                "\t\t\t\t\tonClick=\"window.location.href='/aa-web/evaluate?execution=e1s2&action=securityQuestion&_eventId=cancelAuthentication';return false;\">\n" +
                "\t\t\t\t\tCancel\n" +
                "\t\t\t\t</a>\n" +
                "\t\t\t</div>\n" +
                "\t\t</form>\n" +
                "\t</div>\n" +
                "\t<div id=\"authQuestionContactSupportId\" class=\"authQuestionHeading\">\n" +
                "\t\t    \n" +
                "\t           \n" +
                "\t               \n" +
                "\t                  \n" +
                "\t                  \t\t \n" +
                "\t                         \n" +
                "\t\t                     If you'd like assistance, contact support at 1-855-819-5909 or <a href=\"mailto:optumsupport@optum.com\">optumsupport@optum.com.</a>\n" +
                "\t                  \n" +
                "\t                  \n" +
                "\t                  \n" +
                "\t                  \n" +
                "\t                 \n" +
                "\t           \n" +
                "\t           \n" +
                "           \t\t\n" +
                "\t</div>\n" +
                "\n" +
                "</div>\n" +
                "\n" +
                "                        </div>\n" +
                "                  <div id=\"bottomNavigation\">\n" +
                "                        \n" +
                "<ul>\n" +
                "\t\t\t\t\t<li><a id=\"bottomtab1\" href=\"#\">Link1</a></li>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t</ul>\n" +
                "                  </div>\n" +
                "                  </div><!-- end content -->\n" +
                "              </div>\n" +
                "                  <div id=\"footer\" class=\"clearfix\">\n" +
                "                        \n" +
                "\n" +
                "\n" +
                " \n" +
                " \n" +
                "<!-- image service url from properties file -->\n" +
                "\n" +
                "\n" +
                " \n" +
                "\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\n" +
                "\t\n" +
                "\t\n" +
                "\t\t\n" +
                "\t\n" +
                "\n" +
                "\n" +
                "<input type=\"hidden\" value='bep27643' id=\"relyingAppIdHidden\"/>\t \n" +
                "\n" +
                "<!-- Show panel only for trust broker nextgen -->\n" +
                "<input type=\"hidden\" value='https://stg-healthid.optum.com/tb/services/rest/rp/footerlogo' id=\"footerImageServiceUrlHidden\"/>\n" +
                "<input type=\"hidden\" value='Optum ID' id=\"footerImageAltTextRpidPresentHidden\"/>\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "<div id=\"footerMessage\" class=\"footerMessage\">\n" +
                "\n" +
                "\t<p id=\"footerMessageContent\" >© 2016 Optum, Inc. All rights reserved.</p>\n" +
                "\t\n" +
                "\t<ul id=\"footer-links\" class=\"tk-foot-links\" >\n" +
                "\n" +
                "\t\t<li class=\"footerLink\" id=\"footerLink\" href=\"https://stg-healthid.optum.com/tb/app/index.html#/privacyPolicy\"  onclick=\"openInNewWindow('https://stg-healthid.optum.com/tb/app/index.html#/privacyPolicy'); return false;\">\n" +
                "\t\t\t<a class=\"footerLinkMsg\" href=\"#\">Privacy Policy </a>\n" +
                "\t\t</li>\n" +
                "\t\t<li class=\"footerLink1\" id=\"footerLink1\" href=\"https://stg-healthid.optum.com/tb/app/index.html#/termsOfUse\"  onclick=\"openInNewWindow('https://stg-healthid.optum.com/tb/app/index.html#/termsOfUse'); return false;\">\n" +
                "\t\t\t<a class=\"footerLinkMsg\" href=\"#\" >| Terms of Use</a>\n" +
                "\t\t</li>\n" +
                "\t</ul>\n" +
                "\n" +
                "</div>\t\t\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "                  </div><!-- end footer -->\n" +
                "            </div><!-- end page -->\n" +
                "            <div id=\"extra1\">&nbsp;</div>\n" +
                "            <div id=\"extra2\">&nbsp;</div>\n" +
                "        </body>\n" +
                "</html>";

        String line10 = "                          document.writeln(\"<b>\" + runStartHumanDate + \", duration : 552 seconds </b>\");";

        //String pattern = "(.*)(\\d+)(.*)";
        String pattern1 = "(.*)";
        String pattern2 = ".*http://.*";
        String pattern3 = "te.t";
        String pattern4 = "\\btext\\d";
        String pattern5 = "\"PASSWORD\" value=\"(.*)\"><input type=\"hidden\" name=\"TARGET\"";
        String pattern6 = "\"challengeQuestionList[0].userAnswer\">(.*)</label>";
        String pattern7 = "<pre[^>]*>(.*?)</pre>";
        //String pattern8 = "<label[^>]*>(.|\n)*?</label>";
        String pattern8 = "<label[^>]*>(.|\n|\\*)</label>";
        String pattern9 = "<label id=\"challengeQuestionLabelId\" for=\"challengeQuestionList[0].userAnswer\">(.*?)</label>";
        String pattern10 = "\\d+";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern10);

        // Now create matcher object.
        Matcher m = r.matcher(line10);
        if (m.find( )) {
            System.out.println("Found value: 0 -> " + m.group(0) );
            System.out.println("Found value: 1 -> " + m.group(1) );
            //System.out.println("Found value: " + m.group(2) );
        }else {
            System.out.println("NO MATCH");
        }

    }


}


