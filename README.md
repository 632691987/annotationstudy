JDK proxy 能够代理 final 类，但是 CGLIB 不能。
CGLIB     能够代理无借口的类，但是JDK proxy 不能。


|           | FINAL | NO FINAL | INTERFACE | NO INTERFACE |
| JDK Proxy | OK    | OK       | OK        | NO           |
| CGLIB     | NO    | OK       | OK        | OK           |


对于有 final 的，并且没有 interface 的类，是解决不了的。