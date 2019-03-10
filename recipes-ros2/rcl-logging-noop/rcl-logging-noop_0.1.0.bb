# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An rcl logger implementation that doesn't do anything with log messages."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-ros python3-empy"
SRC_URI = "https://github.com/ros2-gbp/rcl_logging-release/archive/release/crystal/rcl_logging_noop/0.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5bce673a746b95f49a7000e1187fe426"
SRC_URI[sha256sum] = "ce15c3cebde1b2a751431176811186d90a19d525de7efdb66913ce37368aa607"
S = "${WORKDIR}/rcl_logging-release-release-crystal-rcl_logging_noop-0.1.0-0"

inherit catkin
