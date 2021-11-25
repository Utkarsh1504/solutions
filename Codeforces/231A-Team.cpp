#include<bits/stdc++.h>
using namespace std;
 
int main() {
	// #ifndef ONLINE_JUDGE
	// freopen("input.txt", "r", stdin);
  // freopen("output.txt", "w", stdout);
	// #endif
 
	int n;
	cin >> n;
	int count = 0;
	for (int i = 0; i < n; ++i) {
		int p,v,t;
		cin>>p>>v>>t;
		if ((p!=0 && v!=0) || (v!=0 && t!=0) || (t!=0 && p!=0)) {
			count++;
		}
	}
	cout << count << "\n";
	return 0;
}
