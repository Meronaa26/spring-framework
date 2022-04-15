package com.cydeo.entity;

import jdk.jfr.Enabled;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class CreditAccount  extends Account{
    BigDecimal creditLimit;

}
