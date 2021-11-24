#include<bits/stdc++.h>
using namespace std;
 
int main() {
	//#ifndef ONLINE_JUDGE
	//freopen("input.txt", "r", stdin);
        //freopen("output.txt", "w", stdout);
	//#endif
 
	long long int n,m,a,l,b;
	cin>>n>>m>>a;
	l=n/a,b=m/a;
	if (n%a!=0){
		l++;
	} if(m%a!=0){
		b++;
	}
	cout << l*b;
	return 0;
}