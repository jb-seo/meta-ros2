# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Implement the ROS middleware interface using RTI Connext static code generation in C++."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake connext-cmake-module rcutils rmw rmw-connext-shared-cpp rosidl-cmake rosidl-generator-c rosidl-generator-cpp rosidl-generator-dds-idl rosidl-typesupport-connext-c rosidl-typesupport-connext-cpp rti-connext-dds-5.3.1"
SRC_URI = "https://github.com/ros2-gbp/rmw_connext-release/archive/release/crystal/rmw_connext_cpp/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "677c415e6024e9c1b5b7f8103adaabc3"
SRC_URI[sha256sum] = "a4555f1b7959ab4d90e381594f96e4d96c81ff03fdd512cc584f78bd64ef2bab"
S = "${WORKDIR}/rmw_connext-release-release-crystal-rmw_connext_cpp-0.6.1-0"

inherit catkin
