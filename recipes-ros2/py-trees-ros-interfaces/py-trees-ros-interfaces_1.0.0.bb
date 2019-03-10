# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interfaces used by py_trees_ros and py_trees_ros_tutorials."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "action-msgs ament-cmake rosidl-default-generators rosidl-default-runtime unique-identifier-msgs"
SRC_URI = "https://github.com/stonier/py_trees_ros_interfaces-release/archive/release/crystal/py_trees_ros_interfaces/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "09ad6933de99d6b852341508a2cf3987"
SRC_URI[sha256sum] = "47ba6d5e17616b8e2ee00e7ca4f600f95b6e038fc76995a81b52ecdd741a9975"
S = "${WORKDIR}/py_trees_ros_interfaces-release-release-crystal-py_trees_ros_interfaces-1.0.0-0"

inherit catkin
