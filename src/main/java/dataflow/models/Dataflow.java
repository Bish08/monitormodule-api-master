package dataflow.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import dataflow.utilities.CustomConstants;

/**
 * The Entity annotation indicates that this class is a JPA entity. The Table
 * annotation specifies the name for the table in the db.
 *
 * @author matcon
 */

@Entity
@Table(name = CustomConstants.TABLE_DB)

public class Dataflow {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String dataflow_id;
	private String tasps_id;
	private String description;
	private Integer trigger_type;
	private Integer frequency;
	private String last_run_date;
	private String dataflow_load_date;
	private Integer status;
	private String description_status;
	private String dataflow_dependencies;
	private String regex;
	private Integer number_files;
	private String folder;
	private Integer delete_status;
	private String delete_date;
	private Integer auto_increment_date;
	private String last_end_run_date;
	private Integer is_last;
	private String value_pack;

	public Dataflow() {
	}

	public Dataflow(long id) {
		this.id = id;
	}

	public Dataflow(String description, Integer trigger_type, Integer frequency, String last_run_date,
			String dataflow_load_date, Integer status, String dataflow_dependencies, String regex, Integer number_files,
			String folder, String dataflow_id, String tasps_id, String description_status,Integer delete_status,String delete_date, Integer auto_increment_date, String last_end_run_date, Integer is_last, String value_pack) {
		// super();
		// this.id = id;
		this.description = description;
		this.trigger_type = trigger_type;
		this.frequency = frequency;
		this.last_run_date = last_run_date;
		this.dataflow_load_date = dataflow_load_date;
		this.status = status;
		this.dataflow_dependencies = dataflow_dependencies;
		this.regex = regex;
		this.number_files = number_files;
		this.folder = folder;
		this.dataflow_id = dataflow_id;
		this.tasps_id = tasps_id;
		this.description_status = description_status;
		this.delete_status = delete_status;
		this.delete_date = delete_date;
		this.auto_increment_date=auto_increment_date;
		this.last_end_run_date = last_end_run_date;
		this.is_last=is_last;
		this.value_pack=value_pack;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getTrigger_type() {
		return trigger_type;
	}

	public void setTrigger_type(Integer trigger_type) {
		this.trigger_type = trigger_type;
	}

	public Integer getFrequency() {
		return frequency;
	}

	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}

	public String getLast_run_date() {
		return last_run_date;
	}

	public void setLast_run_date(String last_run_date) {
		this.last_run_date = last_run_date;
	}

	public String getDataflow_load_date() {
		return dataflow_load_date;
	}

	public void setDataflow_load_date(String dataflow_load_date) {
		this.dataflow_load_date = dataflow_load_date;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDataflow_dependencies() {
		return dataflow_dependencies;
	}

	public void setDataflow_dependencies(String dataflow_dependencies) {
		this.dataflow_dependencies = dataflow_dependencies;
	}

	public String getRegex() {
		return regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
	}

	public Integer getNumber_files() {
		return number_files;
	}

	public void setNumber_files(Integer number_files) {
		this.number_files = number_files;
	}

	public String getFolder() {
		return folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}

	public String getDataflow_id() {
		return dataflow_id;
	}

	public void setDataflow_id(String dataflow_id) {
		this.dataflow_id = dataflow_id;
	}

	public String getTasps_id() {
		return tasps_id;
	}

	public void setTasps_id(String tasps_id) {
		this.tasps_id = tasps_id;
	}

	public String getDescription_status() {
		return description_status;
	}

	public void setDescription_status(String description_status) {
		this.description_status = description_status;
	}

	public Integer getDelete_status() {
		return delete_status;
	}

	public void setDelete_status(Integer delete_status) {
		this.delete_status = delete_status;
	}

	public String getDelete_date() {
		return delete_date;
	}

	public void setDelete_date(String delete_date) {
		this.delete_date = delete_date;
	}

	public Integer getAuto_increment_date() {
		return auto_increment_date;
	}

	public void setAuto_increment_date(Integer auto_increment_date) {
		this.auto_increment_date = auto_increment_date;
	}

	public String getLast_end_run_date() {
		return last_end_run_date;
	}

	public void setLast_end_run_date(String last_end_run_date) {
		this.last_end_run_date = last_end_run_date;
	}

	public String getValue_pack() {
		return value_pack;
	}

	public void setValue_pack(String value_pack) {
		this.value_pack = value_pack;
	}

	public Integer getIsLast() {
		return is_last;
	}

	public void setIsLast(Integer is_last) {
		this.is_last = is_last;
	}

	@Override
	public String toString() {
		return "Dataflow [id=" + id + ", dataflow_id=" + dataflow_id + ", tasps_id=" + tasps_id + ", description="
				+ description + ", trigger_type=" + trigger_type + ", frequency=" + frequency + ", last_run_date="
				+ last_run_date + ", dataflow_load_date=" + dataflow_load_date + ", status=" + status
				+ ", description_status=" + description_status + ", dataflow_dependencies=" + dataflow_dependencies
				+ ", regex=" + regex + ", number_files=" + number_files + ", folder=" + folder + ", delete_status="
				+ delete_status + ", delete_date=" + delete_date + ", auto_increment_date=" + auto_increment_date
				+ ", getId()=" + getId() + ", getDescription()=" + getDescription() + ", getTrigger_type()="
				+ getTrigger_type() + ", getFrequency()=" + getFrequency() + ", getLast_run_date()="
				+ getLast_run_date() + ", getDataflow_load_date()=" + getDataflow_load_date() + ", getStatus()="
				+ getStatus() + ", getDataflow_dependencies()=" + getDataflow_dependencies() + ", getRegex()="
				+ getRegex() + ", getNumber_files()=" + getNumber_files() + ", getFolder()=" + getFolder()
				+ ", getDataflow_id()=" + getDataflow_id() + ", getTasps_id()=" + getTasps_id()
				+ ", getDescription_status()=" + getDescription_status() + ", getDelete_status()=" + getDelete_status()
				+ ", getDelete_date()=" + getDelete_date() + ", getAuto_increment_date()=" + getAuto_increment_date()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}



}
