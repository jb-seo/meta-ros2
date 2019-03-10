# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provide CMake module to find RTI Connext."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake rti-connext-dds-5.3.1"
SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_connext-release/archive/release/crystal/connext_cmake_module/0.6.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "672aa9e2abd8c8e6ea5a01b7bf8b4f1a"
SRC_URI[sha256sum] = "8caa23925fe887991096acad6bc11127a5db523d941a75e18782e122b7cb475c"
S = "${WORKDIR}/rosidl_typesupport_connext-release-release-crystal-connext_cmake_module-0.6.4-0"

inherit catkin
