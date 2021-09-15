package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test

    public void newAccountShouldHaveNoBalance() {
            Account account = new Account();
            assertThat(account.getBalance()).isEqualTo(0);
    }

    @Test

    public void depositShouldIncreaseBalance() {
        Account account = new Account();
        account.addBalance(100);
        assertThat(account.getBalance()).isEqualTo(0);
        account.addBalance(-10);
        assertThat(account.getBalance()).isEqualTo(0);

    }
}
