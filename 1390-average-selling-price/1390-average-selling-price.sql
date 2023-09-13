# # Write your MySQL query statement below
SELECT p.product_id, round(sum(p.price * u.units) / sum(u.units),2) AS average_price
FROM Prices p INNER JOIN UnitsSold u ON p.product_id = u.product_id and 
u.purchase_date between p.Start_date and p.end_date GROUP BY p.product_id;