# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS specific extensions to the launch tool."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "launch lifecycle-msgs osrf-pycommon rclpy"
SRC_URI = "https://github.com/ros2-gbp/launch-release/archive/release/bouncy/launch_ros/0.6.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0c467077f25ef0989371cbcb172fcf3a"
SRC_URI[sha256sum] = "09cace8c789d3b1ac272664f7a9f98eafa9a84d1442ddf92a287946532062eec"
S = "${WORKDIR}/launch-release-release-bouncy-launch_ros-0.6.0-0"

inherit ros
inherit setuptools3


