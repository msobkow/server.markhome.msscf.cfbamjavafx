// Description: Java 11 JavaFX Display Element Factory for Param.

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
 *	CFBamJavaFXParamFactory JavaFX Display Element Factory
 *	for Param.
 */
public class CFBamJavaFXParamFactory
implements ICFBamJavaFXParamFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXParamFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamParamObj argFocus ) {
		CFBamJavaFXParamAttrPane retnew = new CFBamJavaFXParamAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamServerMethodObj argContainer,
		ICFBamParamObj argFocus,
		Collection<ICFBamParamObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXParamListPane retnew = new CFBamJavaFXParamListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamParamObj argFocus,
		ICFBamServerMethodObj argContainer,
		Collection<ICFBamParamObj> argDataCollection,
		ICFBamJavaFXParamChosen whenChosen )
	{
		CFBamJavaFXParamPickerPane retnew = new CFBamJavaFXParamPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamParamObj argFocus ) {
		CFBamJavaFXParamEltTabPane retnew = new CFBamJavaFXParamEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamParamObj argFocus ) {
		CFBamJavaFXParamAddPane retnew = new CFBamJavaFXParamAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamParamObj argFocus ) {
		CFBamJavaFXParamViewEditPane retnew = new CFBamJavaFXParamViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamParamObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXParamAskDeleteForm retnew = new CFBamJavaFXParamAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamParamObj argFocus,
		ICFBamServerMethodObj argContainer,
		Collection<ICFBamParamObj> argDataCollection,
		ICFBamJavaFXParamChosen whenChosen )
	{
		CFBamJavaFXParamPickerForm retnew = new CFBamJavaFXParamPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamParamObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXParamAddForm retnew = new CFBamJavaFXParamAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamParamObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXParamViewEditForm retnew = new CFBamJavaFXParamViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
