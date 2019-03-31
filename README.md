# UrlShortner

This project implements a Url Shortner.

The solution uses a Trie implementation, stored in the database as one to many relationship`

|ID	|	Path	        | Parent Id  |
|:------|:--------------|:-----      |
|1	|www.apple.com	    |   null	 |
|2	|retail		        |	    1    |
|3	|www.amazon.com	    |   null     |
|4	|Iphone		        |       2    |
|5	|iPhone8	        |	    4    |
|6	|Red		        |       5    |
|7	|Buy	            |       6    |
|8	|retail		        |       3    |
|9	|Phones		        |	    8    |
|10	|iPhone		        |       9    |
|11	|Iphone8	        |       10   |
|12	|Red		        |       11   |

So in this case if user enters the Url
1. www.apple.com/retail/iphone/iphone8/red/buy, we return HexaTridecimal value of 7 = "7"
2. www.amazon.com/retail/phones/iphone8/red, we return HexaTridecimal value of 12 = "C"

The database is insert only, there is no update or delete queries, so there are no table level or row level locks,
 making the system highly scalable and can easily be migrated to use a nosql database like cassandra
 
 