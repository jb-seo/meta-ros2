# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides a cmake config for the default version of Gazebo for the ROS distribution."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = " gazebo9 libgazebo9-dev"
SRC_URI = "https://github.com/ros2-gbp/gazebo_ros_pkgs-release/archive/release/crystal/gazebo_dev/3.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f97be04842dadb7a7810b37fc54394d6"
SRC_URI[sha256sum] = "6cb7b6829a1995a958848c10c9813be4667a2e0e96ad5b3c04f608abf4c33a09"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-crystal-gazebo_dev-3.1.0-0"

inherit ament
