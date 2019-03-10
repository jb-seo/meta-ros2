# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing various utility types and functions for C"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-ros libyaml-vendor rcl rcutils yaml"
SRC_URI = "https://github.com/ros2-gbp/rcl-release/archive/release/crystal/rcl_yaml_param_parser/0.6.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "545f52916eac396ffdf644336903ea8f"
SRC_URI[sha256sum] = "f8f99c143fbfbec1eb04cd12eaba5473b388c1acefcd849d5e5f607dde6c64a5"
S = "${WORKDIR}/rcl-release-release-crystal-rcl_yaml_param_parser-0.6.5-0"

inherit catkin
