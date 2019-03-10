# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the DDS interfaces for ROS interfaces."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake"
SRC_URI = "https://github.com/ros2-gbp/rosidl_dds-release/archive/release/crystal/rosidl_generator_dds_idl/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "84b07b413d321d949ff4ac288cd9a107"
SRC_URI[sha256sum] = "48f52d487269aacba9ec8e4aa8a0d0646a659daea3042708c1b5a9ac1a32596a"
S = "${WORKDIR}/rosidl_dds-release-release-crystal-rosidl_generator_dds_idl-0.6.0-0"

inherit catkin
