package com.ricknout.rugbyranker.ui.rankings

import com.ricknout.rugbyranker.repository.RugbyRankerRepository
import com.ricknout.rugbyranker.vo.RankingsType
import com.ricknout.rugbyranker.work.RugbyRankerWorkManager
import javax.inject.Inject

class WomensRankingsViewModel @Inject constructor(
        rugbyRankerRepository: RugbyRankerRepository,
        rugbyRankerWorkManager: RugbyRankerWorkManager
) : RankingsViewModel(RankingsType.WOMENS, rugbyRankerRepository, rugbyRankerWorkManager)

