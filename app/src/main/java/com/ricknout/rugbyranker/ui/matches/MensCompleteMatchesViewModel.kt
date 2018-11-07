package com.ricknout.rugbyranker.ui.matches

import com.ricknout.rugbyranker.repository.RugbyRankerRepository
import com.ricknout.rugbyranker.vo.MatchStatus
import com.ricknout.rugbyranker.vo.Sport
import com.ricknout.rugbyranker.work.RugbyRankerWorkManager
import javax.inject.Inject

class MensCompleteMatchesViewModel @Inject constructor(
        rugbyRankerRepository: RugbyRankerRepository,
        rugbyRankerWorkManager: RugbyRankerWorkManager
) : MatchesViewModel(Sport.MENS, MatchStatus.COMPLETE, rugbyRankerRepository, rugbyRankerWorkManager)