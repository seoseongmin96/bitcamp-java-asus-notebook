package com.example.demo.algo.serivce;

/**
 * packageName: com.example.demo.algo.service
 * fileName   : GraphService
 * author     : seoseongmin
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     seoseongmin        최초 생성
 */
public interface GraphService {
    int farestnod(int n, int[][] edge);
    int rank(int n, int[][] results);
    int roomnumber(int[] arrows);
}