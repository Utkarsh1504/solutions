#include<bits/stdc++.h>
using namespace std;
 
int main() {
	//#ifndef ONLINE_JUDGE
	//freopen("input.txt", "r", stdin);
   //freopen("output.txt", "w", stdout);
	//#endif
 
	int n,k;
	cin >> n >> k;
	int count = 0;
	int a[n];
	for (int i = 1; i <= n; ++i) {
		cin >> a[i];
	}
	for (int j = 1; j <= n; ++j) {
		if (a[j]>=a[k] && (a[j]!=0 || a[k]!=0) ) {
			count++;
		}
	}
	cout << count << "\n";
	return 0;
}
