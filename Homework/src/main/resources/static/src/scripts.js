function getQualidade(){
    var request = new XMLHttpRequest();

    var cidade = $("#cidade").val();
    var estado = $("#estado").val();
    var pais = $("#pais").val();

    request.open('GET', 'http://localhost:8080/city/' + cidade + '/state/' + estado + '/country/' + pais, true);

    console.log("request ---> ", request);
    /*

    request.onload
    ...

     */
}