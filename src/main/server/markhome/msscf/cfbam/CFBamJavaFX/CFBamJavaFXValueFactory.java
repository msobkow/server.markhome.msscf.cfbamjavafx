// Description: Java 11 JavaFX Display Element Factory for Value.

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
 *	CFBamJavaFXValueFactory JavaFX Display Element Factory
 *	for Value.
 */
public class CFBamJavaFXValueFactory
implements ICFBamJavaFXValueFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXValueFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamValueObj argFocus ) {
		CFBamJavaFXValueAttrPane retnew = new CFBamJavaFXValueAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamValueObj argFocus,
		Collection<ICFBamValueObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXValueListPane retnew = new CFBamJavaFXValueListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamValueObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamValueObj> argDataCollection,
		ICFBamJavaFXValueChosen whenChosen )
	{
		CFBamJavaFXValuePickerPane retnew = new CFBamJavaFXValuePickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamValueObj argFocus ) {
		CFBamJavaFXValueEltTabPane retnew = new CFBamJavaFXValueEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamValueObj argFocus ) {
		CFBamJavaFXValueAddPane retnew = new CFBamJavaFXValueAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamValueObj argFocus ) {
		CFBamJavaFXValueViewEditPane retnew = new CFBamJavaFXValueViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamValueObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXValueAskDeleteForm retnew = new CFBamJavaFXValueAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamValueObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamValueObj> argDataCollection,
		ICFBamJavaFXValueChosen whenChosen )
	{
		CFBamJavaFXValuePickerForm retnew = new CFBamJavaFXValuePickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamValueObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXValueAddForm retnew = new CFBamJavaFXValueAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamValueObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXValueViewEditForm retnew = new CFBamJavaFXValueViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
