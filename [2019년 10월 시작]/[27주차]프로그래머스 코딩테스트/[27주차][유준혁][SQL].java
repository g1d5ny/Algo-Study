SELECT USER_ID
FROM CARTS A, CARTS_PRODUCT B
WHERE A.ID = B.CART_ID AND B.NAME = '밀가루'
GROUP BY USER_ID
ORDER BY USER_ID
