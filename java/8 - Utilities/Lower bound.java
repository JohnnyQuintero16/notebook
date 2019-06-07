Dado un arreglo ordenado ascendentemente de tamaño n, busca el elemento x y devuelve la posición más a la izquierda, si no lo encuentra devuelve la siguiente posición. Si la posición se sale del arreglo devuelve -1.

static int lower_bound(int arr[], int n, int x) {
	int l = 0, r = n-1;
	if (arr[r] < x) return -1;
	while (l < r){
		int m = (l+r)/2;
		if (arr[m] < x) l = m+1;
		else r = m;
	}
	return l;
}
