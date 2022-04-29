package keno.ToyKotlin.security

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AccountService(@Autowired private val accountRepository: AccountRepository) {
    fun saveAccount(account: Account): Account {
        return accountRepository.save(account)
    }

}