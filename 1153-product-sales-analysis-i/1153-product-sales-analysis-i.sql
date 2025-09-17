# Write your MySQL query statement below
select a.product_name , b.year , b.price
from Product as a
join Sales as b
on a.product_id= b.product_id