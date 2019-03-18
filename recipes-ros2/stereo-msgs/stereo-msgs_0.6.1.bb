# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some stereo camera related message definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " rosidl-default-generators rosidl-default-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/crystal/stereo_msgs/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b73cb2c9a49e32e19f810ddfdf5c647a"
SRC_URI[sha256sum] = "02091b01f35da1e96319e42ee309af8aa4d495611b960d775569298133ba3d1b"
S = "${WORKDIR}/common_interfaces-release-release-crystal-stereo_msgs-0.6.1-0"

inherit ament pythonpath-insane
