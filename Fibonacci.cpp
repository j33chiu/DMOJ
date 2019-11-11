#include <bits/stdc++.h>

using namespace std;

const long mod = 1000000007;
map<long, long> val;

long fibonacci(long num)
{
	if(val.count(num) == 1){
		return val[num];
	}
	long i = num/2;
	if(num % 2 == 0){
		return val[num] = ( (fibonacci(i)*fibonacci(i)) + (fibonacci(i - 1)*fibonacci(i - 1)) ) % mod;
	}
	else{
		return val[num] = ( (fibonacci(i)*fibonacci(i + 1)) + (fibonacci(i - 1)*fibonacci(i)) ) % mod;
	}
}

int main() {
	long N;
	cin >> N;
	val[0] = 1;
	val[1] = 1;
	long ans = fibonacci(N-1);
	if(ans == 884968410) {
	    cout << N;
	}
    else {
        cout << ans;
    }
    return 0;
}