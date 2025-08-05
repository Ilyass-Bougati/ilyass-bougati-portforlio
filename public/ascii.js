let grad = ".:-=+*#%@"
let upperGrad = "*#%@"
let lowerGrad = ".:-=+"
let ascii = document.getElementsByClassName("ascii")[0]
let content = "                                   +#=            +*-                                                                                             \n%%%:   -%%:               +*-      %@*            %@*                                                               **                            \n@@@#   -@@-               %@+      %@*            %@*                                                               @@                            \n@@@%.  -@@-               %@+      %@*                                                                              @@                            \n@@%@*  -@@-   =#%%#:   =##%@####   %@*+#%#.    -####=    :#*-#%#+     =#%#=*#:            =#*     *#=   =#%%#.   *##@@###*                        \n@@#@%  -@@-  *@@@@@%-  #@@@@@@@@   %@%@@@@%    +@@@@*    -@%%@@@@+   +%@@@%%@-            =@%.   :@@-  *@@@@@%-  %@@@@@@@%                        \n@@+%@* -@@- .%@%-=%@%  :--%@*---   %@@#=#@@=   .==%@*    -@@%++%@%   %@%-=%@@-             %@*   *@%  =@@#-*%@%  ---@@----                        \n@@++@% -@@- *@%   =@@-    %@+      %@%   %@*      %@*    -@@*  +@%  +@%.  +@@-             *@%   %@*  %@%   -@@-    @@                            \n@@+ %@*-@@- #@#    %@+    %@+      %@#   #@#      %@*    -@@:  :@@  *@%    %@-             :@@- =@%.  %@%%%%%%@+    @@                            \n@@+ *@%-@@- %@#    %@*    %@+      %@*   #@#      %@*    -@%    @@  #@#    %@-              %@# #@#   @@%%%%%%%*    @@                            \n@@+  %@*@@- #@#    %@*    %@+      %@*   #@#      %@*    -@%    @@  #@%    %@-              +@% %@=   %@=           @@                            \n@@+  *@%@@- #@%    %@=    %@+      %@*   #@#      %@*    -@%    @@  *@%   -@@-               %@#@%    %@*           @@.        %%%#   #%%%   *%%%-\n@@+   %@@@- +@@-  *@%.    %@#      %@*   #@#      %@*    -@%    @@  :@@*  #@@-               #@@@#    #@%.   .+     %@+        %@@%   %@@%   *@@@=\n@@+   *@@@-  %@%##@@#     *@@%%#   %@*   #@#   ###%@%##* -@%    @@   #@@%%@@@-               :@@@:    .%@%##%%%     %@@%%#     %@@%   %@@%   *@@@=\n@@+   .%@@-  :%@@@@#       #%@@@   %@*   #@#   @@@@@@@@% -@%    @@    #%@%#%@-                %@%      -%@@@@%#     -#%@@%     %@@%   %@@%   *@@@=\n               :+=.                                                     :  @@                 %@+        .++=                                     \n                                                                     ==   #@%                *@%                                                  \n                                                                     *@%%%@@+              #%@@*                                                  \n                                                                     +%%@%%+               %%%*                                                   \n"
let newContent = ascii.textContent.split("");

const FILLED_PROB = 100
const EMPTY_PROB = 100000000
const TIME_WAIT = 5
let RUNNING = false

function change() {
    for (let i = 0; i < content.length; i++) {
        let char = content[i]
        if (char == "\n") {
            continue
        } else if (char == " ") {
            if (Math.floor(Math.random() * EMPTY_PROB) == 69) {
                newContent[i] = lowerGrad[Math.floor(Math.random() * lowerGrad.length)]
                continue;
            }
        } else if (grad.includes(char)) {
            if (Math.floor(Math.random() * FILLED_PROB) == 69) {
                newContent[i] = upperGrad[Math.floor(Math.random() * upperGrad.length)]
                continue;
            }
        }
    }

    ascii.textContent = newContent.join("")
}

setInterval(change, TIME_WAIT)
