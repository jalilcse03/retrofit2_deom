<?php
$response=array();
require_once __DIR__.'/db_connect.php';

$db=new Db_connect();
$result=  mysql_query("Select * from products") or die(mysql_error());

if(mysql_num_rows($result)>0){
  $response["products"]=array();  
  while($row=  mysql_fetch_array($result)){
      $product=array();
      $product["id"]=$row["id"];
      $product["name"]=$row["name"];
      $product["price"]=$row["price"];
      $product["description"]=$row["description"];
      
      array_push($response["products"], $product);
  }
  $response["success"]=1;
  
  echo json_encode($response);
}
else{
    $response["success"]=0;
    $response["message"]="No products found";
    echo json_encode($response);
}
?>

