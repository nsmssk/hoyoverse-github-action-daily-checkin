package com.zvyap.dailycheckin;

import com.zvyap.hoyoapi.GameType;
import com.zvyap.hoyoapi.HoyoTokenV2;
import lombok.Builder;
import lombok.Singular;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class CheckInAction {

    private final HoyoTokenV2 token;
    @Singular
    private final List<GameType> games;
    private final WebhookInfo webhook;
}
