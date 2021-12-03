const getProducts = () => {
    return fetch("/api/products")
        .then(response => response.json())
        .catch(error => console.log(error))
}


(() => {
    getProducts()
        .then(products => console.log(products))
})();
