#include <iostream>
using namespace std;

int main() {
    int hh = 0, mm = 0, ss = 0;
    char format[3] = {0, };
    scanf("%2d:%2d:%2d%s", &hh, &mm, &ss, format);
    if (format[0] == 'P') {
	if (hh != 12)
        hh += 12;
    } else if (hh == 12) hh = 0;
    printf("%02d:%02d:%02d", hh, mm, ss);
    return 0;
}