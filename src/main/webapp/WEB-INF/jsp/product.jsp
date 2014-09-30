<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet"
    href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Products</title>
  </head>
  <body>
    <section>
      <div class="jumbotron">
        <div class="container">
          <h1>Products</h1>
          <p>Product</p>
          
		 <div class="col-md-5">
		  <img src="<c:url value="/resource/images/${product.productId}.png"></c:url>" alt="image"  style = "width:100%"/>
		</div>
          <h3>${product.name}</h3>
                <p>${product.productId}</p>
                <p>$${product.unitPrice}</p>
                <p>${product.category}</p>
                <p>${product.manufacturer}</p>
                <p>
                	<a href="<c:url value="/products"></c:url>">Back</a>
                </p>
        </div>
      </div>     
    </section>
  </body>
</html>