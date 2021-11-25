#include<bits/stdc++.h>
using namespace std;
 
int main() {
	//#ifndef ONLINE_JUDGE
	//freopen("input.txt", "r", stdin);
  //freopen("output.txt", "w", stdout);
	//#endif
 
	int n;
	cin >> n;
	string str="";
	for (int i = 0; i < n; ++i) {
		cin>>str;
		if (str.length()<=10) {
			cout<<str<<"\n";
    } else if (str.length()>10) {
			  int abr = str.length()-2;
			  cout<<str[0]<<abr<<str[abr+1]<<"\n";
		}
	}
	return 0;
}
