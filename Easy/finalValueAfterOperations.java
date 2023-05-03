package Easy;
class Solution {
        public static void main(String[] args) {
            Solution solution = new Solution();
            String[] operations = {"++X", "++X", "X++"};
            int finalValue = solution.finalValueAfterOperations(operations);
            System.out.println("Final value of x: " + finalValue);
        }

            public int finalValueAfterOperations(String[] operations) {
                int x = 0;
            for (String op : operations) {
                switch (op) {
                    case "++X":
                    case "X++":
                        x++;
                        break;
                    case "--X":
                    case "X--":
                        x--;
                        break;
                }
            }
            return x;
            }
        }

