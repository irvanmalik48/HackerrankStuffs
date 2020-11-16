#include <iostream>
using namespace std;

int counting(int steps, string path) {
    int a = 0;
    int b = 0;
    for (int i = 0; i < path.length(); i++) {
        if (path[i] == 'U') {
            a++;
        }
        else if (path[i] == 'D') {
            if (a == 0) {
                b++;
            }
            a--;
        }
    }
        return b;
}

int main() {
    int steps;
    string path;
    cin >> steps;
    cin >> path;
    cout << counting(steps, path);
}