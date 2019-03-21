# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Wrapper around ogre3d, it provides a fixed CMake module and an ExternalProject build of ogre."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=f12ef8c0445c08084ae92cf2dcb7ee92"

DEPENDS = "libfreetype6 libfreetype6-dev libx11-dev libxaw libxrandr opengl pkgconfig"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/rviz_ogre_vendor/4.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dab929ad518f6d2fcaff11d7e5ce394d"
SRC_URI[sha256sum] = "5ab4559752c54abf6c3ac4080f03cb9c437f87be1ed14c15ca1d0f8fe595dda2"
S = "${WORKDIR}/rviz-release-release-bouncy-rviz_ogre_vendor-4.0.2-0"

inherit ros
inherit ament


