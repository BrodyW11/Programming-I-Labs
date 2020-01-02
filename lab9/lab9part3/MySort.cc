#include <iostream>
#include <fstream>
#include <ctime>
#include <cmath>
#include <iterator>
#include <vector>
#include <algorithm>
#include <iostream>
#include <stdio.h>


using namespace std;

int main(int argc, char *argv[])
{
	clock_t clockTime; 
	int N;
	sscanf(argv[1], "%d", &N);
	vector<double> data(N);
	for(unsigned int i=0; i<N; i++) 
	   data[i] = rand()/(RAND_MAX+1.0);
	clockTime = clock();
	sort(data.begin(), data.end());
	clockTime = clock() - clockTime;
	cout << (double)clockTime/CLOCKS_PER_SEC << endl;
}