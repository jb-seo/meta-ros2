# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS2 controller (DWB) metapackage"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake costmap-queue dwb-controller dwb-core dwb-critics dwb-msgs dwb-plugins nav-2d-msgs nav-2d-utils"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav2_dwb_controller/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "10b1e02a6e14ea4f1f39b81beadce152"
SRC_URI[sha256sum] = "cd1737ca31749b02003e068d8ac032f7c79ea329dd85f20d7a00a9aff44da391"
S = "${WORKDIR}/navigation2-release-release-crystal-nav2_dwb_controller-0.1.5-0"

inherit catkin
