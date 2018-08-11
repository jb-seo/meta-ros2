# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some stereo camera related message definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake rosidl-default-generators rosidl-default-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/stereo_msgs/0.5.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5d79698da824c725cbfae27f3eea34f5"
SRC_URI[sha256sum] = "7ec7cf1bcae2ce889bb4a016b6774b56b4f5f718371364ea535d1c8f8100e319"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-stereo_msgs-0.5.0-1"

inherit catkin
