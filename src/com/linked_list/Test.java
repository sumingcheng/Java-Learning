package com.linked_list;

/**
 * 链表：Linked list
 * 链表是一种节点前后（父子）的数据结构，由根节点与子节点链构成
 *   1. 每个节点都是对象（类实例）
 *   2. 每个节点都有一个指针指向子节点
 *   3. 每个节点都至少带有增加、插入与删除的方法  （?）
 *   { number: 5, nextNode: { number: 4, nextNode: { number: 3, nextNode: { number: 2, nextNode: { 1: nextNode: null } } } } }
 *   父子关系 => 链表 => 5 => 4 => 3 => 2 => 1
 *              数组 => { 5, 4, 3, 2, 1 }
 *
 *
 * 树形结构 => 链式的结构 => 链表 => 父子节点的结构
 *   nextNode => 指针 => nextNode
 *   链表中提炼的数据结构{ 5 => 4 => 3 => 2 => 1 }
 *                    { 5, 4, 3, 2, 1 }
 *   链表中提炼的数据结构{
 *       { { 5, 小5 } => { 4, 小4 } 。。。。。。。。 }
 *       { { 5, 小5 }, { 4, 小4 } ........ }
 *   }
 * {
 *  *   number: 5,
 *      name: 小5
 *  *   nextNode: {
 *  *     number: 4,
 *        name: 小4
 *  *     nextNode: {
 *  *       number: 3,
 *          name: 小3
 *  *       nextNode: {
 *  *         number: 2,
 *            name: 小2
 *  *         nextNode: {
 *  *           number: 1:
 *              name: 小1
 *  *           nextNode: null
 *  *         }
 *  *       }
 *  *     }
 *  *   }
 * }
 *
 * 数组对于排列的优点和缺点
 * 优点：
 * 1. 访问简单，随机访问（index）
 * 2. 查找速度块 => 元素存储 => 顺序存储（按顺序分配空间） => 下标快速访问元素
 * 3. 数组是从栈中分配内存的，访问比较便捷
 *
 * 缺点：
 * 1. 插入和删除效率非常低，移动后续元素
 * 2. 删除元素，很可能浪费数组的内存分配的空间
 * 3. 内存空间分配必须是连续的（数组长度必须在定义时确定）
 * 4. 很容易长度越界
 *
 * 链表对于排列的优点和缺点
 * 优点：
 * 1.， 插入删除的操作速度很快
 * 2. 内存使用科学，链表 => 节点 => 分配一个空间（链表的节点不是物理层面上内存的连续分配）
 * 3. 链表不是一种数据类型，是通过类来生成的一种数据结构，内存分配大小长度是动态（内存动态分配），自由度大
 *
 * 缺点：
 * 查找比较麻烦，没有下标，没有对链表每个节点位置的标志
 * 查找就必须从根节点开始，查找的效率非常低
 * 不适合非常长的数据排序 （要使用递归查找）
 *
 */

/**
 * 链表 => 树形结构
 *
 * 链表 => 排序
 * 树形 => 包含
 *
 * // 父子结构 => 省 => 城市集合 => 城市 => 县区的集合 => 县区
 * 全国行政区划 [
 *   // 省
 *   {
 *       provinceName
 *       cities: [
 *         {
 *             cityName,
 *             counties: [
 *               {
 *                   countyName
 *               }
 *             ]
 *         }
 *       ]
 *   },
 *   {
 *  *       provinceName
 *  *       cities: [
 *  *         {
 *  *             cityName
 *  *         }
 *  *       ]
 *  *   }
 * ]
 */

public class Test {
    public static void main (String[] args) {
//        LinkedList linkedList = new LinkedList();
//        linkedList.add(5);
//        linkedList.add(4);
//        linkedList.add(3);
//        linkedList.add(2);
//        linkedList.add(1);
//
//        linkedList.print();

        // boolean isRemoved = linkedList.remove(3);
        // System.out.println(isRemoved);

        // linkedList.print();

//        boolean isExist = linkedList.find(5);
//        System.out.println(isExist);

//        linkedList.update(2, 200);
//        linkedList.update(5, 500);
//        linkedList.update(1, 100);
//        linkedList.print();

//        linkedList.insert(2, 300);
//        linkedList.insert(4, 400);
//        linkedList.print();

        AdministrativeArea administrativeArea = new AdministrativeArea();

        IProvince sichuan = administrativeArea.addProvince("四川");
        ICity chengdu = sichuan.addCity("成都");
        ICity nanchong = sichuan.addCity("南充");
        chengdu.addCounty("锦江区");
        chengdu.addCounty("双流区");
        nanchong.addCounty("嘉陵区");
        nanchong.addCounty("顺庆区");

        IProvince[] provincesList = administrativeArea.getProvinceList();

        for (int i = 0; i < administrativeArea.getProvinceLength(); i ++) {
            IProvince province = provincesList[i];
            System.out.print(province.getProvinceName() + " => ");

            ICity[] cityList = province.getCityList();

            for (int j = 0; j < province.getCityLength(); j ++) {
                ICity city = cityList[j];
                System.out.print(city.getCityName() + " => ");

                ICounty[] countyList = city.getCountyList();

                for (int k = 0; k < city.getCountyLength(); k ++) {
                    ICounty county = countyList[k];

                    System.out.print(county.getCountyName() + "/");
                }

                System.out.println();
            }


        }
    }
}
