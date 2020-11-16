#include <iostream>
#include <vector>
using namespace std;

int main() {
    int x;
    cin >> x;
    for(int a = 0; a < x; a++) {
        int n;
        int answer = 0;
        cin >> n;
        vector<int> q(n);
        
        for (int b = 0; b < n; b++) {
           cin >> q[b];
        }

        for (int i = n - 1; i >= 0; i--) {
            if (answer == -1) {
                break;
            }
            int k = i;
            while (q[k] != i + 1) {
                k--;
            }
            if (i - k > 2) {
                answer = -1;
                break;
            } 
            else {
                while (k != i) {
                    swap(q[k], q[k + 1]);
                    k++;
                    answer++;
                }
            }
        }
        if (answer == -1) {
            puts("Too chaotic");
        }
        else {
            cout << answer << "\n";
        }
    }
    return 0;
}