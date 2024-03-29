/*
 * Copyright 2011-2014 the original author or authors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package de.schildbach.wallet;

import java.io.File;
import java.nio.charset.Charset;

import android.os.Build;
import android.os.Environment;
import android.text.format.DateUtils;

import com.google.bitcoin.core.NetworkParameters;
import com.google.bitcoin.params.MainNetParams;
import com.google.bitcoin.params.TestNet3Params;
import com.google.bitcoin.core.CoinDefinition;
import hashengineering.bit.wallet.R;

/**
 * @author Andreas Schildbach
 */
public class Constants
{
	public static final boolean TEST = false; //R.class.getPackage().getName().contains("_test");

	public static final NetworkParameters NETWORK_PARAMETERS = TEST ? TestNet3Params.get() : MainNetParams.get();
	private static final String FILENAME_NETWORK_SUFFIX = NETWORK_PARAMETERS.getId().equals(NetworkParameters.ID_MAINNET) ? "" : "-testnet";

	public static final String WALLET_FILENAME_PROTOBUF = "wallet-protobuf" + FILENAME_NETWORK_SUFFIX;

	public static final String WALLET_KEY_BACKUP_BASE58 = "key-backup-base58" + FILENAME_NETWORK_SUFFIX;
	public static final String WALLET_KEY_BACKUP_PROTOBUF = "key-backup-protobuf" + FILENAME_NETWORK_SUFFIX;

	public static final File EXTERNAL_WALLET_BACKUP_DIR = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
	public static final String EXTERNAL_WALLET_KEY_BACKUP = CoinDefinition.coinName +"-wallet-keys" + FILENAME_NETWORK_SUFFIX;

	public static final String BLOCKCHAIN_FILENAME = "blockchain" + FILENAME_NETWORK_SUFFIX;

	public static final String CHECKPOINTS_FILENAME = "checkpoints" + FILENAME_NETWORK_SUFFIX;

	private static final String EXPLORE_BASE_URL_PROD = CoinDefinition.BLOCKEXPLORER_BASE_URL_PROD;
	private static final String EXPLORE_BASE_URL_TEST = CoinDefinition.BLOCKEXPLORER_BASE_URL_TEST;
	public static final String EXPLORE_BASE_URL = NETWORK_PARAMETERS.getId().equals(NetworkParameters.ID_MAINNET) ? EXPLORE_BASE_URL_PROD
			: EXPLORE_BASE_URL_TEST;
    public static final String EXPLORE_ADDRESS_PATH  = CoinDefinition.BLOCKEXPLORER_ADDRESS_PATH;
    public static final String EXPLORE_TRANSACTION_PATH  = CoinDefinition.BLOCKEXPLORER_TRANSACTION_PATH;
    public static final String EXPLORE_BLOCK_PATH  = CoinDefinition.BLOCKEXPLORER_BLOCK_PATH;


	//public static final String MIMETYPE_PAYMENTREQUEST = "application/"+ CoinDefinition.coinTicker.toLowerCase() +"-paymentrequest"; // BIP 71
	//public static final String MIMETYPE_PAYMENT = "application/"+ CoinDefinition.coinTicker.toLowerCase() +"-payment"; // BIP 71
	//public static final String MIMETYPE_PAYMENTACK = "application/"+ CoinDefinition.coinTicker.toLowerCase() +"-paymentack"; // BIP 71
	public static final String MIMETYPE_TRANSACTION = "application/x-" + CoinDefinition.coinTicker.toLowerCase() + "tx";
	public static final String MIMETYPE_BACKUP_PRIVATE_KEYS = "x-"+CoinDefinition.coinName.toLowerCase()+"/private-keys";


	public static final int MAX_NUM_CONFIRMATIONS = 7;
	public static final String USER_AGENT = CoinDefinition.coinName +" Wallet";
	public static final String DEFAULT_EXCHANGE_CURRENCY = "USD";
	public static final int WALLET_OPERATION_STACK_SIZE = 256 * 1024;
	public static final long BLOCKCHAIN_STATE_BROADCAST_THROTTLE_MS = DateUtils.SECOND_IN_MILLIS;
	public static final long BLOCKCHAIN_UPTODATE_THRESHOLD_MS = DateUtils.HOUR_IN_MILLIS;

	public static final String CURRENCY_CODE_BTC = CoinDefinition.coinTicker;
	public static final String CURRENCY_CODE_MBTC = "m" + CoinDefinition.coinTicker;
	public static final String CURRENCY_CODE_UBTC = "µ" + CoinDefinition.coinTicker;

	public static final char CHAR_HAIR_SPACE = '\u200a';
	public static final char CHAR_THIN_SPACE = '\u2009';
	public static final char CHAR_ALMOST_EQUAL_TO = '\u2248';
	public static final char CHAR_CHECKMARK = '\u2713';
	public static final String CURRENCY_PLUS_SIGN = "+" + CHAR_THIN_SPACE;
	public static final String CURRENCY_MINUS_SIGN = "-" + CHAR_THIN_SPACE;
	public static final String PREFIX_ALMOST_EQUAL_TO = Character.toString(CHAR_ALMOST_EQUAL_TO) + CHAR_THIN_SPACE;
	public static final int ADDRESS_FORMAT_GROUP_SIZE = 4;
	public static final int ADDRESS_FORMAT_LINE_SIZE = 12;

	public static final int BTC_MAX_PRECISION = 8;
	public static final int MBTC_MAX_PRECISION = 5;

	public static final int LOCAL_PRECISION = 8;        //altcoins need more digits in BTC
    //TODO: What about these two things?
	public static final String DONATION_ADDRESS = CoinDefinition.DONATION_ADDRESS;
	public static final String REPORT_EMAIL = "hashengineeringsolutions@gmail.com";

	public static final int UBTC_MAX_PRECISION = 2;


	public static final String REPORT_SUBJECT_ISSUE = "Reported issue";
	public static final String REPORT_SUBJECT_CRASH = "Crash report";

	public static final String LICENSE_URL = "http://www.gnu.org/licenses/gpl-3.0.txt";

    public static final String FORKED_FROM_SOURCE = "based on bitcoin-wallet 3.46\n";
    public static final String FORKED_FROM_SOURCE_BITCOINJ = "based on bitcoinj 0.12\n";
	public static final String SOURCE_URL = "https://github.com/HashEngineering/" + CoinDefinition.coinName.toLowerCase() + "-wallet";
	public static final String BINARY_URL = "https://github.com/HashEngineering/"+ CoinDefinition.coinName.toLowerCase() +"-wallet/releases";
	public static final String CREDITS_BITCOINJ_URL = "https://github.com/HashEngineering/" + CoinDefinition.coinName.toLowerCase() + "j";
	public static final String CREDITS_ZXING_URL = "http://code.google.com/p/zxing/";
    public static final String CREDITS_WEBSITE_URL = "http://bit.io/";
    public static final String CREDITS_FORUM_URL = "https://bittalk.org/";

	public static final String CREDITS_ICON_URL = "https://bitcointalk.org/index.php?action=profile;u=2062";

	public static final String AUTHOR_TWITTER_URL = "https://twitter.com/#!/HashEngineering";
	public static final String AUTHOR_GOOGLEPLUS_URL = "https://profiles.google.com/HashEngineering";

	public static final String COMMUNITY_GOOGLEPLUS_URL = "https://plus.google.com/communities/105515929887248493912";

	public static final String MARKET_APP_URL = "market://details?id=%s";
	public static final String WEBMARKET_APP_URL = "https://play.google.com/store/apps/details?id=%s";
	public static final String MARKET_PUBLISHER_URL = "market://search?q=pub:\"Hash Engineering Solutions\"";

	public static final String VERSION_URL = "http://wallet.schildbach.de/version";
	public static final int HTTP_TIMEOUT_MS = 15 * (int) DateUtils.SECOND_IN_MILLIS;

	public static final long LAST_USAGE_THRESHOLD_JUST_MS = DateUtils.HOUR_IN_MILLIS;
	public static final long LAST_USAGE_THRESHOLD_RECENTLY_MS = 2 * DateUtils.DAY_IN_MILLIS;

	public static final int SDK_JELLY_BEAN = 16;
	public static final int SDK_JELLY_BEAN_MR2 = 18;

	public static final int SDK_DEPRECATED_BELOW = Build.VERSION_CODES.ICE_CREAM_SANDWICH;

	public static final boolean BUG_OPENSSL_HEARTBLEED = Build.VERSION.SDK_INT == Constants.SDK_JELLY_BEAN
			&& Build.VERSION.RELEASE.startsWith("4.1.1");

	public static final int MEMORY_CLASS_LOWEND = 48;

	public static final Charset UTF_8 = Charset.forName("UTF-8");
	public static final Charset US_ASCII = Charset.forName("US-ASCII");
}
