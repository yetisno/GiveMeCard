# Give Me Card
### Generate Card No
![Travis CI](https://travis-ci.org/yetisno/GiveMeCard.svg?branch=master)

## Usage
```bash
	java -jar givemecard-1.0.jar <[A]mericanExpress, [C]hina Union Pay, [J]CB, [M]asterCard, [V]isa> <count> <with expire date?[Y/N]>
```

## Example
```bash
# create 10 MasterCard's Credit Card number with expire date.
$ java -jar givemecard-1.0.jar M 10 Y
    Card No	 Expire Date
5215442535024552	0422
5246580271569919	0717
5527422522531382	1122
5327973042387061	0919
5541497852896698	0718
5233427094845321	1016
5214485562913214	0722
5444675182031924	0725
5399919718599599	0124
5506377845168731	0419


# create 10 Visa's Credit Card number without expire date.
$ java -jar givemecard-1.0.jar V 10 N
    Card No
4722446597141963
4365547891192941
4989815619573528
4539298843978232
4563204517270798
4762113987221174
4084226295075131
4451165284215982
4660067965732771
4980891396553735
```