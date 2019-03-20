# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the DDS interfaces for ROS interfaces."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/rosidl_dds-release/archive/release/bouncy/rosidl_generator_dds_idl/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d4e8731513886aef34fbbe51fd9156ad"
SRC_URI[sha256sum] = "e3b5259dd5625e6bf4ae85e30cb44e52d53ad8083ead253b79cd0bb7f99b5223"
S = "${WORKDIR}/rosidl_dds-release-release-bouncy-rosidl_generator_dds_idl-0.5.0-0"


inherit ros
inherit ament

