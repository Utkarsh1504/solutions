// my stupid solution :) 
#include<bits/stdc++.h>
using namespace std;
 
int main() {
	//#ifndef ONLINE_JUDGE
	//freopen("input.txt", "r", stdin);
   // freopen("output.txt", "w", stdout);
	//#endif
 
	int m,n;
	cin >> m >> n;
	int count = 0;
	if (m%2==0 && n>=1) {
		count = m/2 * n;
	} else if (m%2==1 && n%2==0) {
		count = m * n/2;
	} else if (m%2==1 && n%2==1) {
		count = ((m/2)*n) + (n/2);
	}
	cout << count << "\n";
	return 0;
}

// little and less complicated solution from others :):)

#include <iostream>
using namespace std;
 
int main()
{
    int m, n;
    cin>>m>>n;
    int counts = (m*n)/2;
    cout<<counts;
}
