package com.example.model;

import com.example.domain.VerificationType;
import lombok.Data;

@Data
public class TwoFactorAuth {
	private boolean isEnabled = false;
	private VerificationType sendTo;

}
