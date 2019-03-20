# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provide CMake module to find RTI Connext."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rti-connext-dds-5.3.1"
SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_connext-release/archive/release/bouncy/connext_cmake_module/0.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a2093ff998fd85fbb343b80f8a5152ca"
SRC_URI[sha256sum] = "b4de3760777ddd49af63859add8af16855e90510c1930cfba9a94976bf04d106"
S = "${WORKDIR}/rosidl_typesupport_connext-release-release-bouncy-connext_cmake_module-0.5.3-0"


inherit ros
inherit ament

