// Description: Java 11 JavaFX Display Element Factory for Chain.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamJavaFX;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.*;
import org.apache.commons.codec.binary.Base64;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBam.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;

/**
 *	CFBamJavaFXChainFactory JavaFX Display Element Factory
 *	for Chain.
 */
public class CFBamJavaFXChainFactory
implements ICFBamJavaFXChainFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXChainFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamChainObj argFocus ) {
		CFBamJavaFXChainAttrPane retnew = new CFBamJavaFXChainAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamChainObj argFocus,
		Collection<ICFBamChainObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXChainListPane retnew = new CFBamJavaFXChainListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamChainObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamChainObj> argDataCollection,
		ICFBamJavaFXChainChosen whenChosen )
	{
		CFBamJavaFXChainPickerPane retnew = new CFBamJavaFXChainPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamChainObj argFocus ) {
		CFBamJavaFXChainEltTabPane retnew = new CFBamJavaFXChainEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamChainObj argFocus ) {
		CFBamJavaFXChainAddPane retnew = new CFBamJavaFXChainAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamChainObj argFocus ) {
		CFBamJavaFXChainViewEditPane retnew = new CFBamJavaFXChainViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamChainObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXChainAskDeleteForm retnew = new CFBamJavaFXChainAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamChainObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamChainObj> argDataCollection,
		ICFBamJavaFXChainChosen whenChosen )
	{
		CFBamJavaFXChainPickerForm retnew = new CFBamJavaFXChainPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamChainObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXChainAddForm retnew = new CFBamJavaFXChainAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamChainObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXChainViewEditForm retnew = new CFBamJavaFXChainViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
