// Description: Java 11 JavaFX Display Element Factory for NumberCol.

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
 *	CFBamJavaFXNumberColFactory JavaFX Display Element Factory
 *	for NumberCol.
 */
public class CFBamJavaFXNumberColFactory
implements ICFBamJavaFXNumberColFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXNumberColFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamNumberColObj argFocus ) {
		CFBamJavaFXNumberColAttrPane retnew = new CFBamJavaFXNumberColAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamNumberColObj argFocus,
		Collection<ICFBamNumberColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXNumberColListPane retnew = new CFBamJavaFXNumberColListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamNumberColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamNumberColObj> argDataCollection,
		ICFBamJavaFXNumberColChosen whenChosen )
	{
		CFBamJavaFXNumberColPickerPane retnew = new CFBamJavaFXNumberColPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamNumberColObj argFocus ) {
		CFBamJavaFXNumberColEltTabPane retnew = new CFBamJavaFXNumberColEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamNumberColObj argFocus ) {
		CFBamJavaFXNumberColAddPane retnew = new CFBamJavaFXNumberColAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamNumberColObj argFocus ) {
		CFBamJavaFXNumberColViewEditPane retnew = new CFBamJavaFXNumberColViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamNumberColObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXNumberColAskDeleteForm retnew = new CFBamJavaFXNumberColAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamNumberColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamNumberColObj> argDataCollection,
		ICFBamJavaFXNumberColChosen whenChosen )
	{
		CFBamJavaFXNumberColPickerForm retnew = new CFBamJavaFXNumberColPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamNumberColObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXNumberColAddForm retnew = new CFBamJavaFXNumberColAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamNumberColObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXNumberColViewEditForm retnew = new CFBamJavaFXNumberColViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
