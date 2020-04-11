package com.siit.strings.exampleATMDenisa;

import org.assertj.core.data.Offset;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class ATMServiceTest {

    @Mock
    private BankDataBase bankDataBase;

    private ATMService sut;

    @Before //se executa inainte de fiecare metoda @Test
    public void setup() {
        sut = new ATMService(bankDataBase);
    }

    @Test //pt fiecare metoda @Test se creaza o instanta noua de ATMServiceTest
    public void given_card_when_interogate_balance_then_balance_is_returned() {
        //given
        Card card = new Card("123456789", "1234");
        BankAccount account = mock(BankAccount.class);
        double balance = 10000.0; //euro

        //nu se pot combina Matchers(any, anyString, anyINt) cu valori reale
        //in cazul unor parametri multipli, ori matchers ori valori concrete

//        given(bankDataBase.getBankAccountByCardNumber(anyString())).willReturn(account);
        given(bankDataBase.getBankAccountByCardNumber(card.getNumber())).willReturn(account);
        given(account.getBalance()).willReturn(balance);

        //When
        double returnedBalance = sut.interrogateBalance(card);


        //Then
        assertThat(returnedBalance).isCloseTo(balance, Offset.strictOffset(0.0000001));


        BigDecimal dec = new BigDecimal(10);
        assertThat(dec).isEqualTo(BigDecimal.TEN);

        boolean isGreaterThanArgument = dec.compareTo(new BigDecimal(2)) > 0;
    }


}
